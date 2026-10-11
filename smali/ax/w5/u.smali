.class public final synthetic Lax/w5/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/y5/b$a;


# instance fields
.field public final synthetic a:Lax/w5/v;


# direct methods
.method public synthetic constructor <init>(Lax/w5/v;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/w5/u;->a:Lax/w5/v;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/w5/u;->a:Lax/w5/v;

    invoke-static {v0}, Lax/w5/v;->a(Lax/w5/v;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
