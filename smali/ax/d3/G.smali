.class public final synthetic Lax/d3/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/b0/a;


# instance fields
.field public final synthetic a:Lax/d3/E$T;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lax/d3/E$T;Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/d3/G;->a:Lax/d3/E$T;

    iput-object p2, p0, Lax/d3/G;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/G;->a:Lax/d3/E$T;

    iget-object v1, p0, Lax/d3/G;->b:Ljava/lang/String;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, v1, p1}, Lax/d3/E$T;->b(Lax/d3/E$T;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method
