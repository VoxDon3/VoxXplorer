.class public final synthetic Lax/d3/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/A0/l;


# instance fields
.field public final synthetic a:Ljava/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/Consumer;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/d3/I;->a:Ljava/util/function/Consumer;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/I;->a:Ljava/util/function/Consumer;

    invoke-static {v0, p1, p2}, Lax/d3/J;->a(Ljava/util/function/Consumer;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
