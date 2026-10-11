.class public final synthetic Lax/d3/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lax/d3/E;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lax/d3/E;Z)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/d3/B;->a:Lax/d3/E;

    iput-boolean p2, p0, Lax/d3/B;->b:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/B;->a:Lax/d3/E;

    iget-boolean v1, p0, Lax/d3/B;->b:Z

    check-cast p1, Landroid/os/Bundle;

    invoke-static {v0, v1, p1}, Lax/d3/E;->R4(Lax/d3/E;ZLandroid/os/Bundle;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
